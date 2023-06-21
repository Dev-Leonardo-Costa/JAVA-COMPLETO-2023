package generics_set_map.hashcode_equals;

import java.util.Objects;

public class Cliente {

    private String name;
    private String email;

    public Cliente(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return email == cliente.email && Objects.equals(name, cliente.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email);
    }
}

