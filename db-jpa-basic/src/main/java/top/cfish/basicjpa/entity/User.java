package top.cfish.basicjpa.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @author: isisiwish
 * @date: 2019/5/13
 * @time: 14:35
 */
@Getter
@Setter
@NoArgsConstructor
@Entity
public class User implements Serializable
{
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue
    private Long id;
    
    @Column(nullable = false, unique = true)
    private String userName;
    
    @Column(nullable = false)
    private String passWord;
    
    @Column(nullable = false, unique = true)
    private String email;
    
    @Column(nullable = true, unique = true)
    private String nickName;
    
    @Column(nullable = false)
    private String regTime;
    
    public User(String userName, String passWord, String email, String nickName, String regTime)
    {
        this.userName = userName;
        this.passWord = passWord;
        this.email = email;
        this.nickName = nickName;
        this.regTime = regTime;
    }
}
