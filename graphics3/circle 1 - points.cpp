#include <glut.h>
#include <math.h>


void display (void) {
    glClearColor (1.0,0.0,0.0,1.0);
    glBegin(GL_POINTS);
 for(int i=0;i<1000;++i)
  {
  glVertex3f(cos(2*3.14159*i/1000.0),sin(2*3.14159*i/1000.0),0);
  }
 glEnd();
    
}

int main (int argc, char **argv) {
    glutInit (&argc, argv);
    glutInitDisplayMode (GLUT_DOUBLE);
    glutInitWindowSize (300, 300);
    glutInitWindowPosition (100, 100);
    glutCreateWindow ("This is the window title");

    glutDisplayFunc (display);
    glutReshapeFunc (reshape);
    glutMainLoop ();
    return 0;
}