targets = ["192.168.0.1", "192.168.0.2", "192.168.0.3", "192.168.0.4"];
print(targets[0]);
print(targets[-1]);
print(targets[0:2]);

first = targets[0];
print(first);

targets.append("192.168.0.5");
print(targets);

targets.insert(2, "10.0.0.1");
print(targets);

targets.remove("10.0.0.1");
print(targets);

removed_target = targets.pop(); # This is snake case.
print(targets);
print(removed_target);

print(type(targets));
print(len(targets));

print(removed_target in targets);
print(removed_target not in targets);

ports = (80, 22, 21) # This is a tuple, a imutable list.

for target in targets:
    if(target == "192.168.0.1"):
        break;
        #continue;
    print(target)

# This is a dictionary:
detailed_target = {
    'ip': '127.0.0.1',
    'so': 'windows',
    'ports': [22, 80],
    'online': True
}

print(detailed_target);
detailed_target["so"] = "linux";
del detailed_target["online"];
print(detailed_target);

print(detailed_target.values());

def divide(n1, n2):
    return n1 / n2;

print(divide(892, 12)); # There are positional arguments
print(divide(n2=892, n1=12)); # These are keyword arguments.

#import my_module;
from my_module import ping as false_ping
from my_module import whois as real_whois

false_ping("localhost");
#real_whois("google.com");

import sys;
print(sys.argv);

import os;
print(os.system("ping google.com"))