unsigned char options;

enum Options {
  Left   = 0x01,   // 00000001
  Top    = 0x02,   // 00000010
  Right  = 0x04,   // 00000100
  Bottom = 0x08    // 00001000
};

if (options & Top) {}
if (options & Left) {}
if (options & Right) {}
if (options & Down) {}

EnumSet<Options> options = EnumSet.of(Options.Left, Options.Top);

if (options.contains(Options.Left)) {
  System.out.println("Left");
}

if (options.contains(Options.Top)) {
  System.out.println("Top");
}

//bitflags=changing the integer to binary digits to improve the memory.
