package Recursion;

public class Main {
    public static void main(String[] args){
        //create a list of problems for a homework
        int numOfProblems = 5;

        HomeworkProblem first = null;
        HomeworkProblem ptr = null;

        for (int i = 0; i < numOfProblems; i++) {
            //first node
            if (first == null){
                first = new HomeworkProblem(i);
                ptr = first;
                continue;
            }

            // put more problems into this homework
            ptr.next = new HomeworkProblem(i);
            ptr = ptr.next;
        }

        finish(first);


        ptr = first;
        while (ptr != null){
            // (boolean ? if true do this : if not true do this);
            System.out.println(ptr.finished ? ptr.id + " finished :)": ptr.id + " not finished :(");
            ptr = ptr.next;
        }
    }

    public static void finish(HomeworkProblem first){
        //Stopping condition
        if (first == null){
            return;
        }
        //Finish problem 1
        first.keepCalmAndWork();

        //^v I could switch both of these if I wanted to make the first get done last

        // Call it again with next problem
        finish(first.next);
    }
}
