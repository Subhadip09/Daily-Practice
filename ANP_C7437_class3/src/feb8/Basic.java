package feb8;

import java.util.Objects;

public class Basic {
	int marks;
	
	String name;

	@Override
	public int hashCode() {
		return Objects.hash(marks, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Basic other = (Basic) obj;
		return marks == other.marks && Objects.equals(name, other.name);
	}
}
