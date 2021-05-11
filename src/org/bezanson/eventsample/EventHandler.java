package org.bezanson.eventsample;

import java.util.Map;
import java.util.TreeMap;

public class EventHandler
{
    static Integer             lastItemPrinted     = 0;

    static Map<Integer, Event> eventsToHandleQueue = new TreeMap<>();

    public static void main(String[] args)
    {
        Event[] myEvents = new Event[10];

        myEvents[0] = new Event(1, "First Event");
        myEvents[1] = new Event(2, "Second Event");
        myEvents[2] = new Event(3, "Third Event");
        myEvents[3] = new Event(4, "Fourth Event");
        myEvents[4] = new Event(5, "Fifth Event");
        myEvents[5] = new Event(6, "Sixth Event");

        handleEvent(myEvents[1]);
        handleEvent(myEvents[3]);
        handleEvent(myEvents[0]);
        handleEvent(myEvents[5]);
        handleEvent(myEvents[4]);
        handleEvent(myEvents[2]);

    }

    private static void handleEvent(Event event)
    {
        if (event.getEventId() == (lastItemPrinted + 1))
        {
            printEvent(event);
        }
        else
        {
            eventsToHandleQueue.put(event.getEventId(), event);
        }
    }

    private static void printEvent(Event event)
    {
        System.out.println("The event ID is: " + event.getEventId() + " and the message is: " + event.getEventName());

        lastItemPrinted = event.getEventId();

        handleEventsInQueue();
    }

    private static void handleEventsInQueue()
    {
        if (!eventsToHandleQueue.isEmpty())
        {
            Event event = eventsToHandleQueue.get(lastItemPrinted + 1);
            if (event != null)
            {
                eventsToHandleQueue.remove(lastItemPrinted + 1);
                printEvent(event);
            }
        }
    }

}
