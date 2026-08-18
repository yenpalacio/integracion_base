package Data;

import Modules.Courses;
import Modules.EnroLlments;
import Modules.Students;
import jdk.jshell.Snippet;

import java.util.ArrayList;
import java.util.List;

public class DataStore {
   private final List<Students> liststudents ;
    private final List<Courses> listcourses ;
   private final List<EnroLlments> listenroLlments;

   public DataStore(){
       liststudents = new ArrayList<>();
       listcourses= new ArrayList<>();
       listenroLlments= new ArrayList<>();
   }
   public  List<Students> getStudents(){
       return liststudents;
   }
   public void addStudent(Students student){
       liststudents.add(student);
   }
   public Students getStudent (Long id){
       for(Students students: liststudents){
           if(students.getId().equals(id)){
               return students;
           }

       }
       return null;
   }
   public void removeStudent(Long id){
       Students student= getStudent(id);
       if (student != null){
           liststudents.remove(student);
       }
   }

    public List<Courses> getListcourses() {
        return listcourses;
    }
    public void addCourses(Courses courses){
       listcourses.add(courses);
    }
    public Courses getCourses(Long id){
       for(Courses courses: listcourses){
           if(courses.getId().equals(id)){
               return courses;
           }

       }
       return null;
    }
    public void removeCourses (Long id){
       Courses courses = getCourses(id);
       if (courses != null){
           listcourses.remove(courses);
       }
    }
    public List<EnroLlments> getListenroLlments(){
       return listenroLlments;
    }
    public void addEnroLlments(EnroLlments enroLlments){
       listenroLlments.add(enroLlments);
    }
    public EnroLlments getEnroLlments (Long studentid){
       for (EnroLlments enroLlments: listenroLlments){
           if (enroLlments.getStudentid().equals(studentid)){
               return enroLlments;
           }
       }
       return null;
    }
    public void removeEnroLlments (Long studentid){
       EnroLlments enroLlments =getEnroLlments(studentid);
       if (enroLlments != null){
           listenroLlments.remove(enroLlments);
       }
    }
}
