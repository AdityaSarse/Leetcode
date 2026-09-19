/**
 * @param {number} radius
 * @param {number} xCenter
 * @param {number} yCenter
 * @param {number} x1
 * @param {number} y1
 * @param {number} x2
 * @param {number} y2
 * @return {boolean}
 */
var checkOverlap = function(radius, xCenter, yCenter, x1, y1, x2, y2) {
    // Find the closest X coordinate on the rectangle to the circle center
    const closestX = Math.max(x1, Math.min(xCenter, x2));
    
    // Find the closest Y coordinate on the rectangle to the circle center
    const closestY = Math.max(y1, Math.min(yCenter, y2));
    
    // Calculate the distance between the closest point and the circle center
    const distanceX = xCenter - closestX;
    const distanceY = yCenter - closestY;
    
    // Use the Pythagorean theorem to check if the distance is within the radius
    const distanceSquared = (distanceX * distanceX) + (distanceY * distanceY);
    
    return distanceSquared <= (radius * radius);
};
