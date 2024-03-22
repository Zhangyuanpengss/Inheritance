public class MusicConsertEvent extends Event{
    private boolean merchandiseRequired;
    private double merchandiseCost;
    private double MusicConsertEventCost;

    public MusicConsertEvent(String eventID,String eventName,String eventLocation,String pointOfContack,double eventCost,int totalParticipants,int totalEventDays){
        super(eventID,eventName,eventLocation,pointOfContack,eventCost,totalParticipants,totalEventDays);
        this.merchandiseCost=merchandiseCost;
  
    }

    public void setmerchandiseCost(double cost){
        this.merchandiseCost=cost;

    }

    public double getmerchandiseCost(){
        return merchandiseCost;
    }

    @Override
    public void calculateEventCost(){
        MusicConsertEventCost=merchandiseCost+geteventCost();
    }


    public String  toString(){
        return "Conference Event details:"+"\n"+
        "Event ID:"+getEventID()+"\n"+
        "Event Name:"+getEventName()+"\n"+
        "Event Location:"+geteventLocation()+"\n"+
        "Point of Contact:"+geteventPointOfContact()+"\n"+
        "Total participants:"+gettotalParticipants()+"\n"+
        "Total Conference Cost:"+getmerchandiseCost()+"\n";
    }
     
        

    
}
