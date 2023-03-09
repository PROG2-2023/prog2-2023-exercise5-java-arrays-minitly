package prog2.exercise5.flight.booking.system;
import java.time.LocalDate;
public class FlightBooking {
    /////tostring old and new returning 要改逻辑
    ////ID中间数要随机生成，要求在ex4
    ////费用计算要分类，要求ex4
    ///returndate判断加一还是加二没血
    enum TripSource
    {
            NANJING, BEIJING, SHANGHAI, OULU, HELSINKI,  PARIS
    }
    enum TripDestination
    {
        NANJING, BEIJING, SHANGHAI, OULU, HELSINKI,  PARIS
    }
    enum SourceAirport
    {
        NANJINGLUKOUINTERNATIONNALAIRPORT,BEIJINGCAPITALINTERNATIONNALAIRPORT,SHANGHAIPUDONGINTERNATIONNALAIRPORT,
    OULUAIRPORT,HELSINKIAIRPORT,PARISCHARLESDEGAULLEAIRPORT,
    }

    enum DestinationAirport
    {
        NANJINGLUKOUINTERNATIONNALAIRPORT,BEIJINGCAPITALINTERNATIONNALAIRPORT,SHANGHAIPUDONGINTERNATIONNALAIRPORT,
    OULUAIRPORT,HELSINKIAIRPORT,PARISCHARLESDEGAULLEAIRPORT,
    }
    enum BookingClass
    {
            FIRST,BUSINESS,ECONOMY
    }
    enum TripType
    {
        ONE_WAY,RETURN
    }

    String flightCompany="Flights-of-Fancy";//1
    String flightID="FOF0345IN";//2
    String[] passengerFullName;//3
    String[] passengerGender;//3.1
    int[] passengerAge;//3.2
    FlightBooking.TripSource tripSource;//4
    FlightBooking.SourceAirport sourceAirport;//5
    FlightBooking.TripDestination tripDestination;//6
    FlightBooking.DestinationAirport destinationAirport;//7
    LocalDate departureDate;//8
    LocalDate returnDate;//9
    int childPassengers;//10
    int adultPassengers;//11
    int totalPassengers;//12
    double departingTicketPrice;//13
    double returnTicketPrice;//14
    double totalTicketPrice;//15
    String ticketNumber[];//16
    FlightBooking.TripType tripType;//17
    FlightBooking.BookingClass bookingClass;//18
    int size;

    public FlightBooking(){}
    public FlightBooking(int size)
    {
        this.size=size;
        passengerFullName=new String[size];
        passengerGender=new String[size];
        passengerAge=new int[size];
        ticketNumber=new String[size];
    }
    //public FlightBooking(String passengerFullName,LocalDate departureDate,LocalDate returnDate,int childPassengers,int adultPassengers)
    //{
        //this.passengerFullName=passengerFullName;
        //this.departureDate=departureDate;
        //this.returnDate=returnDate;
        //this.childPassengers=childPassengers;
        //this.adultPassengers=adultPassengers;
        //this.totalPassengers=childPassengers+adultPassengers;
    //}



    //1
    public String getFlightCompany()
    {
        return flightCompany;
    }
    public void setFlightCompany(String flightCompany)
    {
        this.flightCompany=flightCompany;
    }
    //2  
    public String getFlightID()
    {
        return flightID;
    }
    public void setFlightID(String flightID)
    {
        this.flightID=flightID;
    }
    //3
    public String getPassengerFullName(int index)
    {
        return passengerFullName[index];
    }
    public void setPassengerFullName(int index,String passengerFullName)
    {
        this.passengerFullName[index]=passengerFullName;
    }
     //3.1
     public String getPassengerGender(int index)
     {
         return passengerGender[index]; 
     }
     public void setPassengerGender(int index,String passengerGender)
     {
         this.passengerGender[index]=passengerGender;
     }
     //3.2
     public int getPassengerAge(int index)
     {
         return passengerAge[index]; 
     }
     public void setPassengerAge(int index,int passengerAge)
     {
         this.passengerAge[index]=passengerAge;
     }


     //4
     public FlightBooking.TripSource getTripSource()
     {
         return tripSource;
     }
     public void setTripSource(String num)
     {
        FlightBooking.TripSource ts=null;
        switch(num)
        {
            case "1":this.tripSource=ts.values()[0];break;
            case "2":this.tripSource=ts.values()[1];break;
            case "3":this.tripSource=ts.values()[2];break;
            case "4":this.tripSource=ts.values()[3];break;
            case "5":this.tripSource=ts.values()[4];break;
            case "6":this.tripSource=ts.values()[5];break;
        }
         
     }
     //5 
     public FlightBooking.SourceAirport getSourceAirport()
     {
         return sourceAirport;
     }
     public void setSourceAirport(String num)
     {
        FlightBooking.SourceAirport sa=null;
        switch(num)
        {
            case "1":this.sourceAirport=sa.values()[0];break;
            case "2":this.sourceAirport=sa.values()[1];break;
            case "3":this.sourceAirport=sa.values()[2];break;
            case "4":this.sourceAirport=sa.values()[3];break;
            case "5":this.sourceAirport=sa.values()[4];break;
            case "6":this.sourceAirport=sa.values()[5];break;
        }
     }
     //6 
     public FlightBooking.TripDestination getTripDestination()
     {
         return tripDestination;
     }
     public void  setTripDestination(String sou,String num)
     {
        FlightBooking.TripDestination td=null;
        if(!sou.equals(num))
       { 
        switch(num)
        {
            case "1":this.tripDestination=td.values()[0];break;
            case "2":this.tripDestination=td.values()[1];break;
            case "3":this.tripDestination=td.values()[2];break;
            case "4":this.tripDestination=td.values()[3];break;
            case "5":this.tripDestination=td.values()[4];break;
            case "6":this.tripDestination=td.values()[5];break;
        }
       }
     }
     //7   destinationAirport
     public FlightBooking.DestinationAirport getDestinationAirport()
     {
         return destinationAirport;
     }
     public void  setDestinationAirport(String sou,String num)
     {
        FlightBooking.DestinationAirport da=null;
        if(!sou.equals(num))
        {
        switch(num)
        {
            case "1":this.destinationAirport=da.values()[0];break;
            case "2":this.destinationAirport=da.values()[1];break;
            case "3":this.destinationAirport=da.values()[2];break;
            case "4":this.destinationAirport=da.values()[3];break;
            case "5":this.destinationAirport=da.values()[4];break;
            case "6":this.destinationAirport=da.values()[5];break;
        }
        }
     }
     //8 departureDate
     public LocalDate getDepartureDate()
     {
         return departureDate;
     }
     public void setDepartureDate(LocalDate departureDate)
     {
         this.departureDate=departureDate;
     }
     //9 returnDate
     public LocalDate getReturnDate()
     {
         return returnDate;
     }
     public void setReturnDate(LocalDate returnDate)
     {
        //if(returnDate==departureDate.plusDays(1))
        //{
            this.returnDate=returnDate.plusDays(1);
        //}
        //else if(returnDate.equals(departureDate))
        //{
        //    this.returnDate=returnDate.plusDays(2);
        //}
     }
 
     //10 
     public int getChildrenPassengers()
     {
         return childPassengers;
     }
     public void setChildrenPassengers(int childPassengers)
     {
         this.childPassengers=childPassengers;
     }
     //11
     public int getAdultPassengers()
     {
         return adultPassengers;
     }
     public void setAdultPassengers(int adultPassengers)
     {
         this.adultPassengers=adultPassengers;
     }
     //12 
     public int  getTotalPassengers()
     {
         return totalPassengers;
     }
     public void  setTotalPassengers(int childPassengers,int adultPassengers)
     {
         this.totalPassengers=childPassengers+adultPassengers;
     }
     //13 
     public double  getDepartingTicketPrice()
     {
         return departingTicketPrice;
     }
     public void  setDepartingTicketPrice(int child,int adults)
     {
         this.departingTicketPrice=(((child*(300 + (0.15*300) + (0.1*300))) + (adults*(300 + (0.15*300) + (0.1*300)))) + 250);
     }
      //14 
      public double  getReturnTicketPrice()
      {
          return returnTicketPrice;
      }
      public void  setReturnTicketPrice()
      {
          this.returnTicketPrice=0;
      }
      //15  
      public double  getTotalTicketPrice()
      {
          return totalTicketPrice;
      }
      public void  setTotalTicketPrice()
      {
          this.totalTicketPrice=departingTicketPrice*2;
      }
      //16 
      public String getTicketNumber(int index)
      {
          return ticketNumber[index];
      }
      public void setTicketNumber(int index)
      {
          this.ticketNumber[index]="11FASDFDOM";
      }
      //17
      public FlightBooking.TripType getTripType()
      {
          return tripType;
      }
      public void setTripType(String num)
      {
        FlightBooking.TripType tt=null;
        switch(num)
        {
            case "1":this.tripType=tt.values()[0];break;
            case "2":this.tripType=tt.values()[1];break;

        }
      }
      //18
      public FlightBooking.BookingClass getBookingClass()
      {
          return bookingClass;
      }
      public void setBookingClass(String num)
      {
        FlightBooking.BookingClass bc=null;
        switch(num)
        {
            case "1":this.bookingClass=bc.values()[0];break;
            case "2":this.bookingClass=bc.values()[1];break;
            case "3":this.bookingClass=bc.values()[2];break;

        }
      }

      public String toString()
      {
       return ("Thank you for booking your flight with " + 
        flightCompany + ". Following are the details of your booking and the trip:" + "\n" + 
        "Ticket Number: " + ticketNumber + "\n" +
        "Passenger Name:" + passengerFullName + "\n" +
        "From " + tripSource + " to " + tripDestination + "\n" +
        "Date of departure: " + departureDate + "\n" +
        "Date of return: " + returnDate + "\n" + 
        "Total passengers: " + totalPassengers + "\n" +
        "Total ticket price in Euros: " + totalTicketPrice + "\n" +
        "IMPORTANT NOTICE: As per our policy, the return date was changed because it was less than two days apart from your departure date.");
      }
      public void displayTripDetails(int size)
      {
        System.out.println("Thank you for booking your flight with " + flightCompany +"\n"+
                            "You reserved a total of "+ size +" tickets.");
        for(int i=0;i<size;i++)
        {
            System.out.println(
            "Here are the trip details for Passenger No." + i +"\n" +
            "Passenger's Ticket Number: " + ticketNumber[i] + "\n" +
            "Passenger Name:" + passengerFullName[i] + "\n" +
            "Passenger Age:" + passengerAge[i] + "\n" +
            "Passenger Gender:" + passengerGender[i] + "\n" +
            "From " + tripSource + "("+ sourceAirport +")"+"\n" +
            "To " + tripDestination + "("+ destinationAirport +")"+"\n" +
            "The flight departs on: " + departureDate + "\n" +
            "And the return flight is on: " + returnDate + "\n" );
           
        }
        System.out.println("The total ticket price is: "+totalTicketPrice);
        System.out.println("IMPORTANT NOTICE: As per our policy, the return date was changed because it was less than two days apart from your departure date.");
      }
   



}



