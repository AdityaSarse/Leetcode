var asteroidCollision = function(asteroids) {
    let res = [];

    for (let asteroid of asteroids) {

        let destroyed = false;

        while (
            res.length > 0 &&
            res[res.length - 1] > 0 &&
            asteroid < 0
        ) {
            let top = res[res.length - 1];

            if (Math.abs(top) < Math.abs(asteroid)) {
                res.pop();
            }
            else if (Math.abs(top) === Math.abs(asteroid)) {
                res.pop();
                destroyed = true;
                break;
            }
            else {
                destroyed = true;
                break;
            }
        }

        if (!destroyed) {
            res.push(asteroid);
        }
    }

    return res;
};