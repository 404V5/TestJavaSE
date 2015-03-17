package com.langsin.thread.testz;

/**
 * ¿‡À∆”⁄∂©µ•
 * @author Administrator
 */
public class Future implements Data {
	private Real real;
	private boolean ready = false;

	public synchronized void setReal(Real real) {
		if (ready) {
			return;
		}
		this.real = real;
		this.ready = true;
		notifyAll();
	}

	@Override
	public synchronized String obtainString() {
		if (!ready) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		return real.obtainString();
	}

}
