public class Course {
    Teacher courseTeacher;
     String name;
     String code;
     String prefix;
     int note;
     int viva;
     double vivaPerTotal;
    public Course(String name, String code, String prefix,double vivaPerTotal) {
        this.courseTeacher = courseTeacher;
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.viva=0;
        this.vivaPerTotal=vivaPerTotal;
    }
    public void addTeacher(Teacher t){
        if (this.prefix.equals(t.branch)){
            this.courseTeacher=t;
            System.out.println("İşlem başarılı");
        }else {
            System.out.println(t.name+" bu dersi veremez.");
        }
    }
    public void printTeacher(){
        if (courseTeacher!=null){
            System.out.println(this.name+" dersinin Akademisyeni :"+courseTeacher.name);
        } else {
            System.out.println(this.name+" dersine henüz Akademisyen atanmamıştır.");
        }
    }
}
