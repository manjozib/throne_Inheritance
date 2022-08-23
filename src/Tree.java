import java.util.List;

public class Tree {
        List<Tree> child;
        String name;
        public Tree(String name,List<Tree>child) {
            this.name = name;
            this.child = child;
        }
}
