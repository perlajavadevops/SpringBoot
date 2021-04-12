import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

class User
{
    private String name;
    private Integer age;
 
    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
 
    public Integer getAge() {
        return age;
    }
    
    
 
    // other getters and setters
 
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((age == null) ? 0 : age.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (age == null) {
			if (other.age != null)
				return false;
		} else if (!age.equals(other.age))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
    public String toString() {
        return "[" + name + ", " + String.valueOf(age) + "]";
    }
}
 
// Find maximum and minimum value of a field among custom objects
// using Stream in Java 8 and above
class Main
{
    public static void main (String[] args)
    {
    	/*
    	 * 1. repo.getRe();
    	 * 
    	 */
        ArrayList<User> users = new ArrayList<User>();
        users.add(new User("George", 15));
        users.add(new User("Tom", 10)) ;
        users.add(new User("Mike", 12));
        
        ArrayList<User> al = new ArrayList<User>();
        al.add(new User("George", 15));
        al.add(new User("Tom", 10)) ;
        al.add(new User("Mike", 12));
        // get user with minimum age
        User user1 = users.stream()
                        .min(Comparator.comparingInt(User::getAge))
                        .get();
        System.out.println(user1.hashCode());
        User user3 = al.stream()
                .min(Comparator.comparingInt(User::getAge))
                .get();
        user3.setAge(12);
        System.out.println(user3.hashCode());
        HashSet<User> al1 = new HashSet<User>();
        al1.add(user1);
        System.out.println("set "+al1);
        ArrayList<User> al2 = new ArrayList<User>();
        al2.add(user3);
        System.out.println(al2.get(0).hashCode());
        al1.addAll(al2);
        System.out.println(al1);
        System.out.println("User with Minimum age : " + user1);
        System.out.println("User with Minimum age : " + user3);
        
        
 
 
        // get user with maximum age
        User user2 = users.stream()
                        .max(Comparator.comparingInt(User::getAge))
                        .get();
 
        System.out.println("User with Maximum age : " + user2);
    }
}
