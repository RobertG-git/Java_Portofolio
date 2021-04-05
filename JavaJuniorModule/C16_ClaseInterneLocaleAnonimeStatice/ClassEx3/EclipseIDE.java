package src.C16_ClaseInterneLocaleAnonimeStatice.ClassEx3;

public class EclipseIDE {
    private String path;

    public EclipseIDE(String path) {
        this.path = path;
    }

    // local static class
    static class WorkspaceName{
        private String workspace;

        public WorkspaceName(String workspace) {
            this.workspace = workspace;
        }

        public String getWorkspaceName() {
            return this.workspace;
        }
    }

    // local class
    class FilePath {
        public String getFilePath(String fileName) {
            return EclipseIDE.this.path + "/" + fileName;
        }
    }

}
