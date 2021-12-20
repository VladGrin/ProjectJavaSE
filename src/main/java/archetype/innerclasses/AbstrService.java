package archetype.innerclasses;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class AbstrService {

    private int id;

    public AbstrService(int id) {
        this.id = id;
    }

    public void action() {
        System.out.println("Abstract action");
    }

    public abstract void serviceAction();
}
