package businessLogic;

import java.util.List;
import domain.Event;

public class ExtendedIteratorEvents implements ExtendedIterator<Event> {
	List<Event> gertaerak;
	int pos;

	public ExtendedIteratorEvents(List<Event> gertaerak) {
		this.gertaerak = gertaerak;
		this.pos =0;
	}

	// uneko elementua itzultzen du eta aurrekora pasatzen da
	public Event previous() {
		Event prev = gertaerak.get(pos);
		pos--;
		return prev;
	}

	// true aurreko elementua existitzen bada.
	public boolean hasPrevious() {
		if (pos >= 0)
			return true;
		return false;
	}

	// Lehendabiziko elementuan kokatzen da.
	public void goFirst() {
		if (gertaerak.size() > 0)
			pos = 0;
	}

	// Azkeneko elementuan kokatzen da.
	public void goLast() {
		if (gertaerak.size() > 0)
			pos = gertaerak.size() - 1;
	}

	public boolean hasNext() {
		return pos < gertaerak.size();
	}

	public Event next() {
		Event ev = gertaerak.get(pos);
		pos++;
		return ev;
	}
	 

}
