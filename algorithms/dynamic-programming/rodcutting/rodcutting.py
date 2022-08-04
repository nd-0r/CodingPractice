prices = [0, 1, 5, 8, 9, 10, 17, 17, 20, 24, 30]

def max_revenue(rod_len: int) -> int:
    assert rod_len >= 0
    memo = [0 for _ in range(rod_len)]
    for i in range(rod_len):
        best_revenue = 0
        for j in range(max(i, len(prices))):
            best_revenue = max(best_revenue, prices[j] + memo[i - j])
        memo[i] = best_revenue
    return memo[rod_len - 1]

