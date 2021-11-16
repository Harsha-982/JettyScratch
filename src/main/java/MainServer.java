import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;
import org.eclipse.jetty.webapp.Configuration.ClassList;

public class MainServer
{
    public static void main(String[] args) throws Exception {
        Server server = new Server(8080);

        WebAppContext context = new WebAppContext();
        String basePath="/Users/harsha/Documents/Jetty/JettyScratch/src/main/webapp";
        context.setContextPath("/");

        context.setDescriptor(basePath+"/WEB-INF/web.xml");
        context.setResourceBase(basePath);

        ClassList classList=new ClassList();
        ClassList classList1 =classList.setServerDefault(server);

        classList1.addBefore("org.eclipse.jetty.webapp.WebXmlConfiguration",
                "org.eclipse.jetty.annotations.AnnotationConfiguration");

        server.setHandler(context);
        server.start();
        server.join();
    }
}
