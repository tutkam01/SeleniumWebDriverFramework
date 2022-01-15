package assertions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import pages.pagefactory.Page;

public abstract class AbstractAssertions<T extends Page> {
	
	protected T page;
	
	public void setPage(T page) {
		this.page = page;
	}
	
	public T endAssertion() {
		return page;
	}

}
