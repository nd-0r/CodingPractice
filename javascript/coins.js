function calcNumWays(amount, denominations) {
  let num_ways = 0;
  let balance = amount;
  for (let i = denominations.length - 1; i >= 0; i--) {
    for (let num_denoms = 1; num_denoms < amount / denominations[i]; num_denoms++) {
      balance -= (denomination * num_denoms);
      let j = i - 1;
      while (j >= 0) {
        balance -= (denominations[j] * (balance / denominations[j]));
        j--;
      }
      if (balance === 0) {
        num_ways++;
      }
    }
  }
  return num_ways;
}

// iterate through each denomination
// try using between 0 and amount / denomination
// try to fill remainder with other denominations moving right
// if balance is 0, increment; else, move on