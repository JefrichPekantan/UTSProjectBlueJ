import model.*; 
import java.awt.*;
import java.awt.event.*;
import java.text.*;
import java.util.*;
import javax.swing.*;
//s220
public class ShowPanel extends JPanel implements MyObserver
{  
    private School school;
    private JButton viewReport = new JButton("View Report");
    public ShowPanel(School school)
    {   
        this.school = school;
        setup();
        build();
    }
    public void setup()
    {   
        school.attach(this);
        school.instructors().attach(this);
        school.clients().attach(this);
        school.classes().attach(this);
        school.lessons().attach(this);
        school.report();
    } 
    public void build()
    {       
        add(viewReport);
        school.report();
    }
    public void update()
    {
        
    } 
}