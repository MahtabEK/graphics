#include <glut.h>
#include <math.h>


class circle{
public : float x,y,rot;

public:
void createcircle (int k, int r, int h);
};

void circle::createcircle (int k, int r, int h) {
  glBegin(GL_LINES);
    for (int i = 0; i < 180; i++)
    {
    x = r * cos(i) - h;
    y = r * sin(i) + k;
    glVertex3f(x + k,y - h,0);

    x = r * cos(i + 0.1) - h;
    y = r * sin(i + 0.1) + k;
    glVertex3f(x + k,y - h,0);
    }
    glEnd();
}

void display (void) {
    glClearColor (0.0,0.0,0.0,1.0);
    glClear (GL_COLOR_BUFFER_BIT);
    glLoadIdentity();
    glTranslatef(0,0,-20);
    glColor3f(1,1,1);

	circle c;
    c.createcircle(0,10,0);

    glutSwapBuffers();

}

void reshape (int w, int h) {
    glViewport (0, 0, (GLsizei)w, (GLsizei)h);
    glMatrixMode (GL_PROJECTION);
    glLoadIdentity ();
    gluPerspective (60, (GLfloat)w / (GLfloat)h, 0.1, 100.0);
    glMatrixMode (GL_MODELVIEW);
}

int main (int argc, char **argv) {
    glutInit (&argc, argv);
    glutInitDisplayMode (GLUT_DOUBLE);
    glutInitWindowSize (500, 500);
    glutInitWindowPosition (100, 100);
    glutCreateWindow ("A basic OpenGL Circle");

    glutDisplayFunc (display);
    glutIdleFunc (display);
    glutReshapeFunc (reshape);
    glutMainLoop ();
    return 0;
}
