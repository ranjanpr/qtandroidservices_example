import QtQuick 2.6
import QtQuick.Window 2.2
import QtQuick.Controls 1.4

ApplicationWindow {
    id: main
    visible: true
    width: 400
    height: 600

    Text{
        id: buttonText
        anchors.centerIn: parent
        text: "Hello World"
    }

    Button{
        id: okbtn
        text: "click me to kill"

        onClicked: parent.close()
    }

}
