package objectCompare;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class SavingAccount {
    private String name;
    private int id;
    private String department;

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        SavingAccount other= (SavingAccount) obj;

        return this.id== other.id;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }
}

