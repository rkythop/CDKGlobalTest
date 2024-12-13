function frequency(str){
    const freq = new Map();

    // Count frequency 
    for (let ch of str) {
        freq.set(ch, (freq.get(ch) || 0) + 1);
    }

  // print
  for (let x of [...freq.keys()]) {
    console.log(x + ": " + freq.get(x));
  }
}