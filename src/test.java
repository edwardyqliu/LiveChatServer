public class test {
    class Test {
        public void main(String[] args) {
            String script = System.getenv("SCRIPTNAME");
            if (script != null) {
                // BAD: The script to be executed is controlled by the user.
                Runtime.getRuntime().exec(script);
            }
        }
    }
}
