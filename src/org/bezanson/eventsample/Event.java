/**
 * 
 */
package org.bezanson.eventsample;

/**
 * @author e5552669
 *
 */
public class Event
{
    Integer eventId   = 0;

    String  eventName = "";

    public Event(int eventId, String eventName)
    {
        this.eventId = eventId;
        this.eventName = eventName;
    }

    public Integer getEventId()
    {

        return eventId;
    }

    public void setEventId(Integer eventId)
    {

        this.eventId = eventId;
    }

    public String getEventName()
    {
        return eventName;
    }

    public void setEventName(String eventName)
    {
        this.eventName = eventName;
    }

}
