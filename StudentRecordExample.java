public class StudentRecordExample {
    public static void main( String[] args ){
        StudentRecord afrilRecord = new StudentRecord();

        //Memberi nama siswa
        afrilRecord.setName("Afril");

        //Menampilkan nama siswa
        System.out.println(afrilRecord.getName() );

        //Menampilkan jumlah siswa
        System.out.println("Count= "+StudentRecord.getStudentCount());
        }
}
