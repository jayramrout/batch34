package loops;

public class SwitchExample {


    public static void main(String[] args) {
        int month = 3; // this value dynamically...

        String monthName = "";
        if(month == 1) {
            monthName = "JAN";
        } else if(month == 2) {
            monthName = "FEB";
        }else if(month == 3) {
            monthName = "MAR";
        }else if(month == 4) {
            monthName = "APRIL";
        }else if(month == 5) {
            monthName = "MAY";
        }else if(month == 6) {
            monthName = "JUNE";
        }else {
            monthName = "DON'T KNOW";
        }



        switch (month){
            case 1:{
                monthName = "JAN"; break;
            }
            case 2:{
                monthName = "FEB"; break;
            }
            case 3:{
                monthName = "MAR"; break;
            }
            case 4:{
                monthName = "APRIL"; break;
            }
            case 5:{
                monthName = "MAY"; break;
            }
            case 6:{
                monthName = "JUNE"; break;
            }
            default:
                monthName = "DON't KNOW";
        }
        System.out.println("Month name is : " + monthName);
    }
}
