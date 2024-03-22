public class ConferenceEvent extends Event{
    private boolean breakfastRequired;
    private double breakfastCost;
    private boolean lunchRequired;
    private double lunchCost;
    private boolean dinnerRequired;
    private double dinnerCost;

    public ConferenceEvent(String eventID,String eventName,String eventLocation,String pointOfContack,double eventCost,int totalParticipants,int totalEventDays){
        super(eventID,eventName,eventLocation,pointOfContack,eventCost,totalParticipants,totalEventDays);
    }

    @Override
    public void calculateEventCost(){
        conferenceEventCost=super.geteventCost();
    }
}
