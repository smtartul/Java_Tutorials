public class Student {
    String name, stuNo, classes;
    Course mat, fizik, kimya;
    double average;
    boolean isPass;

    public Student(String name, String stuNo, String classes, Course mat, Course fizik, Course kimya) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAverage();
        this.isPass = false;
    }

    public void addBulkExamNote(int mat, int fizik, int kimya) {
        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }
        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }
        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }

    }

    public void addVivaExamNote(int mat, int fizik, int kimya) {
        if (mat >= 0 && mat <= 100) {
            this.mat.viva = mat;
        }
        if (fizik >= 0 && fizik <= 100) {
            this.fizik.viva = fizik;
        }
        if (kimya >= 0 && kimya <= 100) {
            this.kimya.viva = kimya;
        }
    }

    public void calcAverage() {

        this.average = (
                calcVivaAndExamAverage(this.mat.note,this.mat.viva,this.mat.vivaPerTotal) +
                calcVivaAndExamAverage(this.kimya.note,this.kimya.viva,this.kimya.vivaPerTotal) +
                calcVivaAndExamAverage(this.fizik.note,this.fizik.viva,this.fizik.vivaPerTotal)
        ) / 3;
    }

    public boolean isCheckPass() {
        calcAverage();
        return this.average > 55;
    }
    public double calcVivaAndExamAverage(int exam,int viva,double per){
        return exam * (1 - per ) + (viva * per);
    }

    public void printNote() {
        System.out.println("=============");
        System.out.println("Ogrenci : " + this.name);
        System.out.println("Matematik Sınav Notu : " + this.mat.note);
        System.out.println("Matematik Sözlü Notu : " + this.mat.viva);
        System.out.println("Matematik Sözlü Yüzdesi :%" + this.mat.vivaPerTotal*100);
        System.out.println("Matematik Ortalaması : " + calcVivaAndExamAverage(this.mat.note,this.mat.viva,this.mat.vivaPerTotal) );

        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Fizik Sözlü Notu : " + this.fizik.viva);
        System.out.println("Fizik Sözlü Yüzdesi :%" + this.fizik.vivaPerTotal*100);
        System.out.println("Fizik Ortalaması : " + calcVivaAndExamAverage(this.fizik.note,this.fizik.viva,this.fizik.vivaPerTotal) );

        System.out.println("Kimya Notu : " + this.kimya.note);
        System.out.println("Kimya Sözlü Notu : " + this.kimya.viva);
        System.out.println("Kimya Sözlü Yüzdesi :%" + this.kimya.vivaPerTotal*100);
        System.out.println("Kimya Ortalaması : " + calcVivaAndExamAverage(this.kimya.note,this.kimya.viva,this.kimya.vivaPerTotal) );

    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.average);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }
}
