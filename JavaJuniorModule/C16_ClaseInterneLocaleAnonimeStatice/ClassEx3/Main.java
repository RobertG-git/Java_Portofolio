package src.C16_ClaseInterneLocaleAnonimeStatice.ClassEx3;

public class Main {
    public static void main(String[] args) {

        EclipseIDE eclipse = new EclipseIDE("/Users/Devmind/Eclipse");

        // Remember inner non-static class initialization:
       EclipseIDE.FilePath filePath = eclipse.new FilePath();

        // Nested static class initialization:
        // OK - with class name
        EclipseIDE.WorkspaceName workspaceName = new EclipseIDE.WorkspaceName("JSD");

        // ERROR - with instance obj
//        EclipseIDE.WorkspaceName workspaceName2 = eclipse.new WorkspaceName("JSD");

        System.out.println(filePath.getFilePath("InnerClasses.java"));
        System.out.println(workspaceName.getWorkspaceName());
    }
}
