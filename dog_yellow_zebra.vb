Public Class ArtForEveryone
 
    Private _canvasSize as Integer
    Private _backgroundColor As Color
    Private _penColor As Color
    Private _penWidth As Integer
 
    'Constructor
    Public Sub New(ByVal canvasSize As Integer, ByVal backgroundColor As Color, ByVal penColor As Color, ByVal penWidth As Integer)  
        _canvasSize = canvasSize
        _backgroundColor = backgroundColor
        _penColor = penColor
        _penWidth = penWidth
    End Sub
 
    'Gets and sets the canvas size
    Public Property CanvasSize() As Integer 
        Get
            Return _canvasSize
        End Get
        Set
            _canvasSize = value
        End Set
    End Property
 
    'Gets and sets the background color
    Public Property BackgroundColor() As Color
        Get
            Return _backgroundColor
        End Get
        Set
            _backgroundColor = value
        End Set
    End Property
 
    'Gets and sets the pen color
    Public Property PenColor() As Color
        Get
            Return _penColor
        End Get
        Set
            _penColor = value
        End Set
    End Property
 
    'Gets and sets the pen width
    Public Property PenWidth() As Integer
        Get
            Return _penWidth
        End Get
        Set
            _penWidth = value
        End Set
    End Property
 
    'Creates a canvas with the specified size
    Public Sub CreateCanvas()
        Dim g As Graphics = Graphics.FromImage(New Bitmap(_canvasSize, _canvasSize))
 
        'Set the background color
        Dim brush As New SolidBrush(_backgroundColor)
        g.FillRectangle(brush, 0, 0, _canvasSize, _canvasSize)
 
        'Draw a circle
        Dim pen As New Pen(_penColor, _penWidth)
        g.DrawEllipse(pen, 0, 0, _canvasSize, _canvasSize)
    End Sub
 
End Class