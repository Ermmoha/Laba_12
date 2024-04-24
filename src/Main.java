interface User{
    void InterLogin();
    void InterPassord();
}
abstract class People implements User {
    String FIO;
    int Age;
    String Position;
    People(String FIO, int Age, String Post){
        this.FIO = FIO;
        this.Age = Age;
        this.Position = Post;
    }
}
class Teacher extends People{
    String Login;
    String Password;
    Teacher(String FIO, int Age, String Position, String Login, String Password) {
        super(FIO, Age, Position);
        this.Login = Login;
        this.Password = Password;
    }

    @Override
    public void InterLogin() {
        System.out.println(Login);
    }

    @Override
    public void InterPassord() {
        System.out.println(Password);
    }
}
class Student extends People{

    String Login;
    String Password;
    Student(String FIO, int Age, String Position, String Login, String Password) {
        super(FIO, Age, Position);
        this.Login = Login;
        this.Password = Password;
    }

    @Override
    public void InterLogin() {
        System.out.println(Login);
    }

    @Override
    public void InterPassord() {
        System.out.println(Password);
    }
}
public class Main {
    public static void main(String[] args) {
        Student student = new Student("Иванов И.И.", 19, "Студент", "IIva", "12345678");
        Student student1 = new Student("Пушкин А.С.", 11, "Студент", "Pushkin", "Poet007");
        Teacher teacher = new Teacher("Яшин Д.Д.", 55, "Учитель", "Login", "Passowrd");
        Teacher teacher1 = new Teacher("Савицкий И.И.", 21, "Учиетль", "Pro_Gnom", "gnom229");
        student.InterLogin();
        teacher.InterPassord();
    }
}