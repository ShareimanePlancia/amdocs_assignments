package assignment.collections.day6;

public class Member {
    int id;
    String name;
    String address;
    
    public Member(){
    }
    
    public Member(int id, String name, String address) {
        super();
        this.id = id;
        this.name = name;
        this.address = address;
    }
    
    @Override
    public String toString() {
		return "Member ID: " + id + ", Member Name: " + name + " Member address: "+address;
	}	
}
