
public class MainlineProj {
	
	    public static void main(String[] args) {
	    
	        Cellphone iphone = new Cellphone("apple", 1000, "X", "rose gold");
	        Cellphone note = new Cellphone("samsung", 800, "g4", "black");
	        Cellphone google = new Cellphone("google", 750, "pixel", "white");
	        Cellphone dummyphone = new Cellphone("dummy", 300, "pixels", "grey");
	        
	        
	        iphone.setMfg("Apple"); //setting mfg to Apple
	        iphone.setPrice(900);
	        iphone.setModel("8");
	        
	        note.setMfg("Samsung");
	        note.setPrice(650);
	        note.setModel("TS");
	        
	        google.setMfg("Google");
	        google.setPrice(700);
	        google.setModel("Pixel");
	        
	        
	        System.out.println(iphone.getColor());
	        System.out.println(iphone.getMfg());
	        System.out.println(iphone.getModel());
	        System.out.println(iphone.getPrice());
	        System.out.println(dummyphone.getPrice());
	        System.out.println();
	        
	        System.out.println(note.getColor());
	        System.out.println(note.getMfg());
	        System.out.println(note.getModel());
	        System.out.println(note.getPrice());
	        System.out.println(dummyphone.getPrice());
	    }



	
}
