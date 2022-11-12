package basics;

public class T {
	public String toString()                                                            {
	   return"Kavi";
	}
	public int hashCode() {
		return 18;
	}

	public static void main(String[] args) {
		T t=new T();
		System.out.println(t);
		System.out.println(t.hashCode());
	}

}
