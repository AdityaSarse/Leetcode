var completePrime = function(num) {
    const isPrime = n => {
        if (n < 2) return false;
        for (let i = 2; i * i <= n; i++) {
            if (n % i === 0) return false;
        }
        return true;
    };

    const s = String(num);
    for (let i = 1; i <= s.length; i++) {
        if (!isPrime(Number(s.slice(0, i)))) return false;        
        if (!isPrime(Number(s.slice(s.length - i)))) return false; 
    }
    return true;
};