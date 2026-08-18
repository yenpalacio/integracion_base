package Modules;

import java.time.LocalDateTime;

public class EnroLlments {
    private Long coursid;
    private  Long studentid;
    private String status;
    private LocalDateTime createAt;

    public EnroLlments() {
    }

    public EnroLlments(Long coursid, Long studentid, String status) {
        this.coursid = coursid;
        this.studentid = studentid;
        this.status = status;
        this.createAt= LocalDateTime.now();
    }

    public Long getCoursid() {
        return coursid;
    }

    public void setCoursid(Long coursid) {
        this.coursid = coursid;
    }

    public Long getStudentid() {
        return studentid;
    }

    public void setStudentid(Long studentid) {
        this.studentid = studentid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getCreateAt() {
        return createAt;
    }

    public void setCreateAt(LocalDateTime createAt) {
        this.createAt = createAt;
    }
}
