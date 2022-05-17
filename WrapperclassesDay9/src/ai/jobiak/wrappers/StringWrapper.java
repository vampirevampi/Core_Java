package ai.jobiak.wrappers;

public class StringWrapper {
	String str;

	public StringWrapper(String str) {
		super();
		this.str = str;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	@Override
	public String toString() {
		return "StringWrapper [str=" + str + "]";
	}

	
	

}
