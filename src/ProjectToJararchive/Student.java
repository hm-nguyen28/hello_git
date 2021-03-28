package ProjectToJararchive;

public class Student {
  private int age;
  private String name;

  public Student(int age, String name) {
    this.age = age;
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Student{" +
        "age=" + age +
        ", name='" + name + '\'' +
        '}';
  }

  // them comment lan 1
  // them comment lan 2
  // them comment lan 3
  // Day la dong viet them vao thu xem co quay lai duoc khong.

}
