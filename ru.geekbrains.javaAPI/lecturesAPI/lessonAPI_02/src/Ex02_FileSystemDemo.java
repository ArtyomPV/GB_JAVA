import java.io.File;

public class Ex02_FileSystemDemo {
    public static void main(String[] args) {
        String pathProject = System.getProperty("user.dir");
        String pathFile = pathProject.concat("\\text.txt");
        File file1 = new File(pathFile);
        System.out.println(pathProject);
        System.out.println(file1.getAbsolutePath());
        System.out.println(pathFile);

        File file2 = new File("D:\\EducationOnlineSchool\\EducationGB\\2dQuarter\\GB_JAVA\\text.txt");
        File file3 = new File("file.txt");
        System.out.println(file2.getAbsolutePath());
        System.out.println(file3.getAbsolutePath());
    }
}
