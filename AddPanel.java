import java.awt.*; 
import java.awt.event.*;
import javax.swing.*;
import model.*; 
//s220
public class AddPanel extends JPanel 
{
    private School school;
    public AddPanel(School school)
    {   
        this.school = school;
        setup();
        build();   
    }
    private void setup()
    {   
        setLayout(new GridLayout(4, 1));    
    }
    private void build()
    {   
        add(new AddInstructor());
        add(new AddClient());
        add(new AddClass());
        add(new AddLesson());
    }
    private class AddInstructor extends JPanel implements MyObserver
    {
        private JTextField instructorName = new JTextField("Instructor Name: ");
        public AddInstructor()
        {
           setup();
           build();
        }
        private void setup()
        {  
            InstructorListener instructorListener = new InstructorListener();
        }
        private void build()
        {
           add(instructorName);
        }
        public void update()
        {
           
        }
        private class InstructorListener implements ActionListener
        {   
            public void actionPerformed(ActionEvent e)
            {   
                
            }
        }
    }
    private class AddClient extends JPanel implements MyObserver
    {
        private JTextField clientName = new JTextField("Client Name: ");
        public AddClient()
        {
           setup();
           build();
        }
        private void setup()
        {    
           ClientListener listener = new ClientListener();
        }
        private void build()
        {
           add(clientName);
        }
        public void update()
        {
            
        }
        private class ClientListener implements ActionListener
        {   
            public void actionPerformed(ActionEvent e)
            {   
                
            }
        }
    }
    private class AddClass extends JPanel implements MyObserver
    {
        private JTextField classCost = new JTextField();
        private JTextField clientName = new JTextField();
        public AddClass()
        {
           setup();
           build();
        }
        private void setup()
        {   
           ClassListener classListener = new ClassListener();
        }
        private void build()
        {
           
        }
        public void update()
        {
            
        }
        private class ClassListener implements ActionListener
        {   
            public void actionPerformed(ActionEvent e)
            {   
                
            }
        }
    }
    private class AddLesson extends JPanel implements MyObserver
    {
        private JTextField instructorId = new JTextField(10);
        private JTextField clientId = new JTextField(10);
        private JTextField classId = new JTextField(10);
        public AddLesson()
        {
           setup();
           build();
        }
        private void setup()
        {   
           LessonListener lessonListener = new LessonListener();
        }
        private void build()
        {
            
        }
        public void update()
        {
           
        }
        private class LessonListener implements ActionListener
        {   
            public void actionPerformed(ActionEvent e)
            {   
               
            }
        }
    }
}
