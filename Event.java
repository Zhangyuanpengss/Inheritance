public class Event {

    public static final double insuranceCost=1000.00;
    public static final double tax=0.3;

    private String eventID;
    private String eventName;
    private String eventLocation;
    private String eventPointOfContack;
    private double eventCost;
    private int totalParticipants;
    private int totalEventDays;

    public Event(String eventID,String eventName,String eventLocation,String pointOfContack,double eventCost,int totalParticipants,int totalEventDays){

        this.eventID=eventID;
        this.eventName=eventName;
        this.eventLocation=eventLocation;
        this.eventPointOfContack=pointOfContack;
        this.eventCost=eventCost;
        this.totalParticipants=totalParticipants;
        this.totalEventDays=totalEventDays;
    }

    public String getEventID() {
        return eventID;
    }
    public void setEventID(String eventID){
        this.eventID = eventID;
    }
    public String getEventName() {
        return eventID;
    }
    public void setEventName(String eventName){
        this.eventName = eventName;
    }
    public String geteventLocation() {
        return eventLocation;
    }
    public void seteventLocation(String eventLocation){
        this.eventLocation = eventLocation;
    }
    public String geteventPointOfContact() {
        return  eventPointOfContack;
    }
    public void seteventPointOfContact(String eventPointOfContact){
        this.eventPointOfContack = eventPointOfContact;
    }
    public double geteventCost() {
        return  eventCost;
    }
    public void seteventCost(double eventCost){
        this.eventCost = eventCost;
    }
    public int gettotalParticipants() {
        return  totalParticipants;
    }
    public void settotalParticipants(int totalParticipants){
        this.totalParticipants = totalParticipants;
    }
    public int gettotalEventDays() {
        return  totalEventDays;
    }
    public void setotalEventDays(int totalEventDays){
        this.totalEventDays =totalEventDays;
    }

    public String toString() {
        return "Event Details: \n" +
                "Event ID: " + eventID + "\n" +
                "Event Name: " + eventName + "\n" +
                "Event Location: " + eventLocation + "\n" +
                "Event Point of Contact: " + eventPointOfContack + "\n" +
                "Total Participants: " + totalParticipants + "\n" +
                "Total Event Days: " + totalEventDays + "\n" +
                "Event Cost: $" + eventCost;
 
    }

    public void calculateEventCost(){
        this.eventCost=eventCost+(eventCost*tax)+insuranceCost;
    }





    
}