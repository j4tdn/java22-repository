package EX01;

public class Students {
    private int ID;
    private String Name;
    private Arranges Arranges;

    
    public Students(int iD, String name, EX01.Arranges arranges) {
		super();
		ID = iD;
		Name = name;
		Arranges = arranges;
	}



	public int getID() {
		return ID;
	}



	public void setID(int iD) {
		ID = iD;
	}



	public String getName() {
		return Name;
	}



	public void setName(String name) {
		Name = name;
	}



	public Arranges getArranges() {
		return Arranges;
	}



	public void setArranges(Arranges arranges) {
		Arranges = arranges;
	}

	
}
