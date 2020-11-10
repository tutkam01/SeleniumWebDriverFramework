package assertions;

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
