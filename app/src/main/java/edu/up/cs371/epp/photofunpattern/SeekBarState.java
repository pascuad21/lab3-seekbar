package edu.up.cs371.epp.photofunpattern;

public class SeekBarState {
        private static final SeekBarState ourInstance = new SeekBarState();
        private int ourBrightnessDelta;
        public static SeekBarState getInstance() { return ourInstance;}
        public int getBrightnessDelta() { return ourBrightnessDelta;}
        public void setBrightnessDelta(int delta)
        {
            if(delta <= 128){
                if(delta >= -128){
                    ourBrightnessDelta = delta;
                }
            }
// We could potentially constrain the delta to a
// valid range in this setter.
        }
        private SeekBarState()
        {
// Note that this constructor is private. This ensures that nobody
// outside of this class can accidentally create another copy
            ourBrightnessDelta = 0;
        }
}
