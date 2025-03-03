public class conditionalstatement {

    public static void main (String[]args){
        int mark=76;
        char grade;

        if (mark>=90){
            grade='A';
        }else if (mark>=90) {
            grade='b';
        }else if (mark>=80) {
            grade='c';
        }else if (mark>=70) {
            grade='d';
        }
        else{
            grade='f';
        }
        System.out.println("grade=" + grade);
    }    
}
