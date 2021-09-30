@Entity
public class User {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Integer id;
String name;
int age;
  public String getName() {
	return name;
   }
  public void setName(String name) {
   this.name=name;
   }
  public void setAge() {
	  this.age=age;
  }
  public int getAge(int age)
  {
	  return age;
  }
}
