import matplotlib.pyplot as plt
import numpy as np

# Number of lists
n = np.array([5, 10, 25, 50, 100, 250, 500, 600, 800, 1000])

# Experimental times in ms
experimental = np.array([1.182, 1.147, 1.239, 1.421, 1.734, 2.133, 3.305, 4.229, 4.274, 1.941])

# Adjusted theoretical times in ms
adjusted_theoretical = np.array([0.00546, 0.01945, 0.06485, 0.1313, 0.290, 0.723, 1.466, 1.801, 2.314, 1.941])

plt.figure(figsize=(10,6))
plt.plot(n, experimental, 'o-', label='Experimental Time', color='blue')
plt.plot(n, adjusted_theoretical, 's--', label='Adjusted Theoretical Time', color='red')
plt.xlabel('Number of Lists')
plt.ylabel('Time (ms)')
plt.title('Experimental vs Adjusted Theoretical Merge Times')
plt.legend()
plt.grid(True)
plt.tight_layout()
plt.show()
