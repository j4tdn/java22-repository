package controlling;

import java.util.Random;

public class Ex02SwitchCase {
  public static void main(String[] args) {
	// random so ngay trong tuan[2,10]
	
	  
	  int weekday = new Random().nextInt(2,11);
	  System.out.println("weekday---> "+weekday);
	  String wdAsString =null;

  
  switch(weekday) {
  case 2:
	  wdAsString ="thu hai";
	  break;
  case 3:
	  wdAsString ="thu ba";
	  break;
  case 4:
	  wdAsString ="thu bon";
	  break;
  case 5:
	  wdAsString ="thu nam";
	  break;
  case 6:
	  wdAsString ="thu sau";
	  break;
  case 7:
	  wdAsString ="thu bay";
	  break;
  case 8:
	  wdAsString ="chu nhat";
	  break;
	  default:
		  System.out.println("khong hop le");
  }
  if(wdAsString !=null) {
	  System.out.println("wdAsString----->"+wdAsString);
  }
  }}
